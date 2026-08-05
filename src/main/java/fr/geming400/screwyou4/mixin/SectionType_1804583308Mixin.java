package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.lighting.LayerLightSectionStorage.SectionType.class)
public class SectionType_1804583308Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/lighting/LayerLightSectionStorage$SectionType;", cancellable = true)
    private static void values__485255087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-485255087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/lighting/LayerLightSectionStorage$SectionType;", cancellable = true)
    private static void valueOf_1277959796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1277959796L))
            info.setReturnValue(net.minecraft.world.level.lighting.LayerLightSectionStorage.SectionType.LIGHT_AND_DATA);
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/lang/String;", cancellable = true)
    private void display_669122836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(669122836L))
            info.setReturnValue("Q0c妡rIpIRyD䤏k!DHO%Hu=1>[\"㾝_=");
    }


}
