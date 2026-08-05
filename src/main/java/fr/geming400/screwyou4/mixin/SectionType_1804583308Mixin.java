package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.lighting.LayerLightSectionStorage.SectionType.class)
public class SectionType_1804583308Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/lighting/LayerLightSectionStorage$SectionType;", cancellable = true)
    private static void values__1687649805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1687649805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/lighting/LayerLightSectionStorage$SectionType;", cancellable = true)
    private static void valueOf_238876236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(238876236L))
            info.setReturnValue(net.minecraft.world.level.lighting.LayerLightSectionStorage.SectionType.LIGHT_AND_DATA);
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/lang/String;", cancellable = true)
    private void display__239387562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-239387562L))
            info.setReturnValue("Q;Sfsy?\u0FAAeW8Sjw\"$g[FzFX\u54BEXA+*\uA244iXH\uB1C8Wh7S*rM|3\uB103#&%0BJhKfky \u98142\u420ADL)I`$@.@8lfEXo,a'pr/TR^Ia\uC9AEb\uCCF4\u8B0CA\uAB01");
    }


}
