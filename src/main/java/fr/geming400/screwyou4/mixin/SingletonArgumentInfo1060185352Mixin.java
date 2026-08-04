package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.SingletonArgumentInfo.class)
public class SingletonArgumentInfo1060185352Mixin {
        @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/SingletonArgumentInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork__814319238(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-814319238L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_102815087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(102815087L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/SingletonArgumentInfo$Template;", cancellable = true)
    private void unpack_1783795568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1783795568L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack_1973991953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1973991953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_612630143(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(612630143L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/SingletonArgumentInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__982131756(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-982131756L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/SingletonArgumentInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_76388462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(76388462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_600803923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(600803923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contextFree(Ljava/util/function/Supplier;)Lnet/minecraft/commands/synchronization/SingletonArgumentInfo;", cancellable = true)
    private static void contextFree_167017702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(167017702L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contextAware(Ljava/util/function/Function;)Lnet/minecraft/commands/synchronization/SingletonArgumentInfo;", cancellable = true)
    private static void contextAware__1733082126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1733082126L))
            info.setReturnValue(null);
    }


}
