package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ChunkPalettedStorageFix.Direction.class)
public class Direction138130229Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/datafix/fixes/ChunkPalettedStorageFix$Direction;", cancellable = true)
    private static void values__328756176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-328756176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/datafix/fixes/ChunkPalettedStorageFix$Direction;", cancellable = true)
    private static void valueOf__737145801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-737145801L))
            info.setReturnValue(net.minecraft.util.datafix.fixes.ChunkPalettedStorageFix.Direction.WEST);
    }

    @Inject(at = @At("HEAD"), method = "getAxisDirection()Lnet/minecraft/util/datafix/fixes/ChunkPalettedStorageFix$Direction$AxisDirection;", cancellable = true)
    private void getAxisDirection__1838765329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1838765329L))
            info.setReturnValue(net.minecraft.util.datafix.fixes.ChunkPalettedStorageFix.Direction.AxisDirection.NEGATIVE);
    }

    @Inject(at = @At("HEAD"), method = "getAxis()Lnet/minecraft/util/datafix/fixes/ChunkPalettedStorageFix$Direction$Axis;", cancellable = true)
    private void getAxis_1255177503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1255177503L))
            info.setReturnValue(net.minecraft.util.datafix.fixes.ChunkPalettedStorageFix.Direction.Axis.X);
    }


}
