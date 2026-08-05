package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.BlockStateModelDispatcher.MultiPartDefinition.class)
public class MultiPartDefinition_1740942895Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1168512143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1168512143L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_605482919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(605482919L))
            info.setReturnValue("\u8E1AsW0\u23B3\u1AC8u(21&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1779205636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779205636L))
            info.setReturnValue(1719768583);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/world/level/block/state/StateDefinition;)Lnet/minecraft/client/renderer/block/dispatch/multipart/MultiPartModel$Unbaked;", cancellable = true)
    private void instantiate_375468476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(375468476L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectors()Ljava/util/List;", cancellable = true)
    private void selectors__927687586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-927687586L))
            info.setReturnValue(null);
    }


}
