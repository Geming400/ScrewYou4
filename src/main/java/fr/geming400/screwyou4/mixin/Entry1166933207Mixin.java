package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.RangeSelectItemModel.Entry.class)
public class Entry1166933207Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1742521830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742521830L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_31473232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(31473232L))
            info.setReturnValue("'CGzl");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1205195949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1205195949L))
            info.setReturnValue(78637907);
    }

    @Inject(at = @At("HEAD"), method = "threshold()F", cancellable = true)
    private void threshold_1205192570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1205192570L))
            info.setReturnValue(5.729816E8F);
    }

    @Inject(at = @At("HEAD"), method = "model()Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private void model_1294052225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1294052225L))
            info.setReturnValue(null);
    }


}
