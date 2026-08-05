package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.brigadier.StringArgumentSerializer.class)
public class StringArgumentSerializer1386377288Mixin {
        @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_429007023(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(429007023L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/brigadier/StringArgumentSerializer$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_721882282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(721882282L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_938822079(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(938822079L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/brigadier/StringArgumentSerializer$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__1115327196(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1115327196L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_926995859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(926995859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/brigadier/StringArgumentSerializer$Template;", cancellable = true)
    private void deserializeFromNetwork__2051778952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2051778952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/StringArgumentType;)Lnet/minecraft/commands/synchronization/brigadier/StringArgumentSerializer$Template;", cancellable = true)
    private void unpack_1658116071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1658116071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack__1994783407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1994783407L))
            info.setReturnValue(null);
    }


}
