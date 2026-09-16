package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.item.Firework.class)
public class Firework_212374937Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1182875718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1182875718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__696251332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-696251332L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_982798461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(982798461L))
            info.setReturnValue("s\u794E51M%\u6418T1W\u7672*\u9B1Cq1]\uFA650\u577Bo8rt\u65B3K_ySm}\u95AF<^L");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_769727027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(769727027L))
            info.setReturnValue(-1335498492);
    }

    @Inject(at = @At("HEAD"), method = "calculate(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void calculate__1008030348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1008030348L))
            info.setReturnValue(-1746494242);
    }

    @Inject(at = @At("HEAD"), method = "defaultColor()I", cancellable = true)
    private void defaultColor_1761736476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1761736476L))
            info.setReturnValue(-696643469);
    }


}
