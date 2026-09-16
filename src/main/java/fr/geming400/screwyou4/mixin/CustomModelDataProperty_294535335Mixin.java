package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.CustomModelDataProperty.class)
public class CustomModelDataProperty_294535335Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_988651770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(988651770L))
            info.setReturnValue(467389082);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get__1793778872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1793778872L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/String;", cancellable = true)
    private void get__493593226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-493593226L))
            info.setReturnValue("``\uC4FDy^");
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private void type_1455353738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1455353738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__614090934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-614090934L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1064958859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1064958859L))
            info.setReturnValue("jCM\u4194FZF6r3+(\u5EA5PD3 l\"QH7UNiS9\u33FBf|b\u71B5\u26539,^}q%PrU@P\u5BA4yX\uAD47){R\u3E5B>up\u7C29]=Ij`\u2B0B\uD2A6^vu\u8433v\"pxc&5J!}v,}h t4FNe7c");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_851887425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(851887425L))
            info.setReturnValue(1743727670);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec_328086417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(328086417L))
            info.setReturnValue(null);
    }


}
