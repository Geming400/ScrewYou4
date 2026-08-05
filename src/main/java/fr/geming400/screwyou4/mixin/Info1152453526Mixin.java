package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceKeyArgument.Info.class)
public class Info1152453526Mixin {
        @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack_2066260127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2066260127L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/commands/arguments/ResourceKeyArgument;)Lnet/minecraft/commands/arguments/ResourceKeyArgument$Info$Template;", cancellable = true)
    private void unpack__1508595351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1508595351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_693072097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(693072097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/arguments/ResourceKeyArgument$Info$Template;", cancellable = true)
    private void deserializeFromNetwork_378488042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(378488042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_704898317(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(704898317L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/arguments/ResourceKeyArgument$Info$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__1512074602(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1512074602L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/arguments/ResourceKeyArgument$Info$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_618669908(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(618669908L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_195083261(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(195083261L))
            info.cancel();
    }


}
