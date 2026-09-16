package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.RangeSelectItemModel.Entry.class)
public class Entry1166933207Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_258306939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(258306939L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1937356732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1937356732L))
            info.setReturnValue("1Y-t");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1724285298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1724285298L))
            info.setReturnValue(-642811717);
    }

    @Inject(at = @At("HEAD"), method = "threshold()F", cancellable = true)
    private void threshold__1340543505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1340543505L))
            info.setReturnValue(5.984101E8F);
    }

    @Inject(at = @At("HEAD"), method = "model()Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private void model__1972129430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1972129430L))
            info.setReturnValue(null);
    }


}
