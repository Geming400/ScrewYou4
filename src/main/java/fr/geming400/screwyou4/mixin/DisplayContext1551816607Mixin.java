package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.DisplayContext.class)
public class DisplayContext1551816607Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Lnet/minecraft/world/item/ItemDisplayContext;", cancellable = true)
    private void get_1355356699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355356699L))
            info.setReturnValue(net.minecraft.world.item.ItemDisplayContext.GROUND);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get_615412823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(615412823L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private void type__1539586307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1539586307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1357638430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1357638430L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_416356632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(416356632L))
            info.setReturnValue("G3WG<`j6*HeK0ऌꦍ콉>*f-HRq,䠙0ꘘ&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1590079349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1590079349L))
            info.setReturnValue(1213790216);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec_1159850981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1159850981L))
            info.setReturnValue(null);
    }


}
