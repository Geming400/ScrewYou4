package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.FishingRodCast.class)
public class FishingRodCast_923340062Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get__1357575721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1357575721L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1635773511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1635773511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1986114976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1986114976L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__212119914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-212119914L))
            info.setReturnValue("KO|(7Wgj6hM抅$4V.:Aru5d\"+{6\"|bS7pL%KEAAjC>&h;R;Uo/zᖯ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_961602803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(961602803L))
            info.setReturnValue(849665927);
    }


}
