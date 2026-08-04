package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ChunkPalettedStorageFix.Direction.class)
public class Direction138130229Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/datafix/fixes/ChunkPalettedStorageFix$Direction;", cancellable = true)
    private static void values_1440971538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1440971538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/datafix/fixes/ChunkPalettedStorageFix$Direction;", cancellable = true)
    private static void valueOf__2055050481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2055050481L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAxisDirection()Lnet/minecraft/util/datafix/fixes/ChunkPalettedStorageFix$Direction$AxisDirection;", cancellable = true)
    private void getAxisDirection_252884935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(252884935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAxis()Lnet/minecraft/util/datafix/fixes/ChunkPalettedStorageFix$Direction$Axis;", cancellable = true)
    private void getAxis__494045226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-494045226L))
            info.setReturnValue(null);
    }


}
