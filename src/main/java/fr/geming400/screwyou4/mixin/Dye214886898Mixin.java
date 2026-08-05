package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.item.Dye.class)
public class Dye214886898Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_1950740622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1950740622L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1600399157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1600399157L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__920573077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-920573077L))
            info.setReturnValue("r$C6Q/%\u5538\u103A\uBE1DN)\u96A4*/0phaA\u49FD,\uA357tFQG\uC0AE`guc#`:i;V[/NMdZrG\u0957o4\uBC6DaV");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_253149640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(253149640L))
            info.setReturnValue(-1382065635);
    }

    @Inject(at = @At("HEAD"), method = "calculate(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void calculate__441426328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-441426328L))
            info.setReturnValue(-1320214710);
    }

    @Inject(at = @At("HEAD"), method = "defaultColor()I", cancellable = true)
    private void defaultColor_253149144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(253149144L))
            info.setReturnValue(-746091028);
    }


}
