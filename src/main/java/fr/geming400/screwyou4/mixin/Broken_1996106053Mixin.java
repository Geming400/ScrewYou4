package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.Broken.class)
public class Broken_1996106053Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get_2127228628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2127228628L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_600855398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(600855398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1087479784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1087479784L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1528437719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1528437719L))
            info.setReturnValue("rfz'x#omru(G,Gp\uFD70OXF[=q8?1`DZ<\u6E5F#;k2\u551B(Mu5NSUB\uB832_a\u7F61_6S^w\u8265Vv\u945A\uCECF\uC7AD\u08E1UF*+i-C-h\uCDD8");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1741509153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1741509153L))
            info.setReturnValue(2145332592);
    }


}
