package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.TestInstanceBlockEntity.ErrorMarker.class)
public class ErrorMarker1352421073Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1557033964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1557033964L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_216961098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(216961098L))
            info.setReturnValue("치[CIFሹKda?Zk虀a漟kT2jtR穐_S=7oBd9yAg䂌;I_@2#砐욠뛪");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1390683815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390683815L))
            info.setReturnValue(-1931036585);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__540965806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-540965806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "text()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void text__824488092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-824488092L))
            info.setReturnValue(null);
    }


}
