package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.material.FogType.class)
public class FogType_223246310Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/material/FogType;", cancellable = true)
    private static void values__1184354442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1184354442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/material/FogType;", cancellable = true)
    private static void valueOf_2126875773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2126875773L))
            info.setReturnValue(net.minecraft.world.level.material.FogType.WATER);
    }


}
