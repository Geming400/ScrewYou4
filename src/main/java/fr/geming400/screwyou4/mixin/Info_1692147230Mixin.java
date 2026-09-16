package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceSelectorArgument.Info.class)
public class Info_1692147230Mixin {
        @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack__1077711436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1077711436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/commands/arguments/ResourceSelectorArgument;)Lnet/minecraft/commands/arguments/ResourceSelectorArgument$Info$Template;", cancellable = true)
    private void unpack__190153678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-190153678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_410297699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(410297699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/arguments/ResourceSelectorArgument$Info$Template;", cancellable = true)
    private void deserializeFromNetwork_821298736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(821298736L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_1656716663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1656716663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/arguments/ResourceSelectorArgument$Info$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork__955331212(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-955331212L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/arguments/ResourceSelectorArgument$Info$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_498208756(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(498208756L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_144946097(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(144946097L))
            info.cancel();
    }


}
