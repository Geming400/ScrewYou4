package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.IsViewEntity.class)
public class IsViewEntity_1567831592Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get__713084191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-713084191L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__991281981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-991281981L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1341623446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1341623446L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_432371616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(432371616L))
            info.setReturnValue("|]IWnvBw.k^z7鿀cn JF쿵白퍰\"(H7),#(W3gbo^A`㉿5Jm4]zzyٕ簶ﳵUnᒤ\"gVT7: '콉_D[6V_cMiuMjb.;b7SM5屏={nB'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1606094333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1606094333L))
            info.setReturnValue(941202170);
    }


}
