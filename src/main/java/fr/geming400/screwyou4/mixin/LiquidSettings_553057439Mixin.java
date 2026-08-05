package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.LiquidSettings.class)
public class LiquidSettings_553057439Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/structure/templatesystem/LiquidSettings;", cancellable = true)
    private static void values_648298649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(648298649L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/LiquidSettings;", cancellable = true)
    private static void valueOf_137609632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(137609632L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.templatesystem.LiquidSettings.APPLY_WATERLOGGING);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_641266060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(641266060L))
            info.setReturnValue("dJHjc;%bd6R`_Jr6\uBDA1KV[.6?");
    }


}
