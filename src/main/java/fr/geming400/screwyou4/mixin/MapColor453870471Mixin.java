package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.item.MapColor.class)
public class MapColor453870471Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__2105243101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2105243101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1839382730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1839382730L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__681589504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-681589504L))
            info.setReturnValue("3QSmA3[)y縋煏T-H`6垘,_}-궔n#ౚ9sUDfPXP;q2*}W貹.Ul;39!;䢃긳,xcf嗈뮏^1<x[WTfxx.;5<)_[2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_492133213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(492133213L))
            info.setReturnValue(-2081739902);
    }

    @Inject(at = @At("HEAD"), method = "calculate(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void calculate__202442755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-202442755L))
            info.setReturnValue(-2092170340);
    }

    @Inject(at = @At("HEAD"), method = "defaultColor()I", cancellable = true)
    private void defaultColor_492132717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(492132717L))
            info.setReturnValue(-1903216412);
    }


}
