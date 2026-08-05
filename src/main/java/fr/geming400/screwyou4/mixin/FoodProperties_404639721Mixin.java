package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.food.FoodProperties.class)
public class FoodProperties_404639721Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1790151979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1790151979L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__730820255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-730820255L))
            info.setReturnValue("Y[\"JfnYg\uA921(s\u8EB4g\"HaS{a\";Qz_wb4,prbkELR29$X6>B\u8430Ld:U/M}e\u02D5_eA9U/4K\u4E70RL||XDOi\u4698\uFB76[hA79f\u7D90Hj*[HL2X^|;6E\uBE40P?");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_442902462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(442902462L))
            info.setReturnValue(-2112039796);
    }

    @Inject(at = @At("HEAD"), method = "saturation()F", cancellable = true)
    private void saturation_442899083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(442899083L))
            info.setReturnValue(6.63764E7F);
    }

    @Inject(at = @At("HEAD"), method = "canAlwaysEat()Z", cancellable = true)
    private void canAlwaysEat_442918303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(442918303L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onConsume(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/component/Consumable;)V", cancellable = true)
    private void onConsume__1783603316(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1783603316L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nutrition()I", cancellable = true)
    private void nutrition_442901966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(442901966L))
            info.setReturnValue(-1933516307);
    }


}
