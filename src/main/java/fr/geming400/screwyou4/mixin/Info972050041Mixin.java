package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceOrTagKeyArgument.Info.class)
public class Info972050041Mixin {
        @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/arguments/ResourceOrTagKeyArgument$Info$Template;", cancellable = true)
    private void deserializeFromNetwork__467463581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-467463581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork__309799489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-309799489L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/arguments/ResourceOrTagKeyArgument$Info$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_1513097703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1513097703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__575151091(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-575151091L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/arguments/ResourceOrTagKeyArgument$Info$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork__1380311079(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1380311079L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_936619475(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(936619475L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/commands/arguments/ResourceOrTagKeyArgument;)Lnet/minecraft/commands/arguments/ResourceOrTagKeyArgument$Info$Template;", cancellable = true)
    private void unpack_202092476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202092476L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack__1797808624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1797808624L))
            info.setReturnValue(null);
    }


}
