package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceKeyArgument.Info.class)
public class Info1152453526Mixin {
        @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_1117022960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1117022960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/arguments/ResourceKeyArgument$Info$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_1839457671(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1839457671L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork__129396004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-129396004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/arguments/ResourceKeyArgument$Info$Template;", cancellable = true)
    private void deserializeFromNetwork_260625445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(260625445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__394747606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-394747606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/arguments/ResourceKeyArgument$Info$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__1709851789(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1709851789L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/commands/arguments/ResourceKeyArgument;)Lnet/minecraft/commands/arguments/ResourceKeyArgument$Info$Template;", cancellable = true)
    private void unpack_217475611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(217475611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack__1617405139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1617405139L))
            info.setReturnValue(null);
    }


}
