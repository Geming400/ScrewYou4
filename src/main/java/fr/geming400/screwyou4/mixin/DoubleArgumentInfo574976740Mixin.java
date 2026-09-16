package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.brigadier.DoubleArgumentInfo.class)
public class DoubleArgumentInfo574976740Mixin {
        @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack_2100085371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2100085371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/DoubleArgumentType;)Lnet/minecraft/commands/synchronization/brigadier/DoubleArgumentInfo$Template;", cancellable = true)
    private void unpack__1446400083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1446400083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork__706872790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-706872790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/brigadier/DoubleArgumentInfo$Template;", cancellable = true)
    private void deserializeFromNetwork__1014812245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1014812245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_539546174(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(539546174L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/brigadier/DoubleArgumentInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_2014472157(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2014472157L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/brigadier/DoubleArgumentInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__835592007(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-835592007L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__972224392(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-972224392L))
            info.cancel();
    }


}
