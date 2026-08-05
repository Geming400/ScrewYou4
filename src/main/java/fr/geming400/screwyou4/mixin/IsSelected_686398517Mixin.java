package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.IsSelected.class)
public class IsSelected_686398517Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get_817521092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(817521092L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__708852138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-708852138L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__222227752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-222227752L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1456822041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1456822041L))
            info.setReturnValue("jinH\"6[O\u1F6BMK\u6506J}&CHN$#RY\u1052z`[h:N\u02FA^>g5cSx2VHXr#\u7B54\u09A7\u5DFCjDn\u145E\uC46Ds,4b-rBNi|lU>E2O{pki<j^1U");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1243750607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1243750607L))
            info.setReturnValue(1820330592);
    }


}
