package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.item.GrassColorSource.class)
public class GrassColorSource2003366568Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_608115914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(608115914L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1094740300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094740300L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1521177203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1521177203L))
            info.setReturnValue("\u3AD6Aj_%*4hX.$>.gH; \u505963ikos_\uC7FAl3^\uFCF6*BD0cr7x\u062Cwn\u8FD0\u9CC4fk$N]\u5026/Y1zuTs#\u6251\uA9878e\uFA08)sPCq\u69FD/3ieNh$HMV}%\uCCA5i. A\u5A24");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1734248637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1734248637L))
            info.setReturnValue(-1006372734);
    }

    @Inject(at = @At("HEAD"), method = "temperature()F", cancellable = true)
    private void temperature_1923694679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1923694679L))
            info.setReturnValue(3.33329E7F);
    }

    @Inject(at = @At("HEAD"), method = "calculate(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void calculate_782961284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(782961284L))
            info.setReturnValue(-592314135);
    }

    @Inject(at = @At("HEAD"), method = "downfall()F", cancellable = true)
    private void downfall__1580839858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1580839858L))
            info.setReturnValue(3.33329E7F);
    }


}
