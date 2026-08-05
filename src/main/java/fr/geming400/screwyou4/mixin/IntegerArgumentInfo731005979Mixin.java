package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.brigadier.IntegerArgumentInfo.class)
public class IntegerArgumentInfo731005979Mixin {
        @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork__226364286(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-226364286L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/brigadier/IntegerArgumentInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_898326372(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(898326372L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_283450770(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(283450770L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/brigadier/IntegerArgumentInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_1692079216(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1692079216L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_271624550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(271624550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/brigadier/IntegerArgumentInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_907490250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(907490250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/IntegerArgumentType;)Lnet/minecraft/commands/synchronization/brigadier/IntegerArgumentInfo$Template;", cancellable = true)
    private void unpack__379403638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-379403638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack_1644812580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1644812580L))
            info.setReturnValue(null);
    }


}
