package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.SelectBlockModel.SwitchCase.class)
public class SwitchCase_1541219814Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_632593545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(632593545L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1983323958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1983323958L))
            info.setReturnValue("6y&k\u3B8AHHLy\u68C25N.\uBF26");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private void values__1575826377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1575826377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2098571904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2098571904L))
            info.setReturnValue(522779298);
    }

    @Inject(at = @At("HEAD"), method = "model()Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;", cancellable = true)
    private void model_310958926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(310958926L))
            info.setReturnValue(null);
    }


}
