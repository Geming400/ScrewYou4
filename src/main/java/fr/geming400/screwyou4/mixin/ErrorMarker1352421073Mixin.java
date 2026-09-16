package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.TestInstanceBlockEntity.ErrorMarker.class)
public class ErrorMarker1352421073Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_443794805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(443794805L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2122844598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2122844598L))
            info.setReturnValue("RnLG\u2988U");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1909773164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1909773164L))
            info.setReturnValue(-1910112515);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__928355202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-928355202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "text()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void text_451660881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(451660881L))
            info.setReturnValue(null);
    }


}
