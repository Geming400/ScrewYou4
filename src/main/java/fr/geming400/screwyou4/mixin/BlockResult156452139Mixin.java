package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.blocks.BlockStateParser.BlockResult.class)
public class BlockResult156452139Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1541964398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1541964398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__979007836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-979007836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_194714881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(194714881L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "properties()Ljava/util/Map;", cancellable = true)
    private void properties__1848171501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1848171501L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nbt()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void nbt__1413770781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1413770781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void blockState__2139306727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2139306727L))
            info.setReturnValue(null);
    }


}
