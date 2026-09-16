package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.functions.PlainTextFunction.class)
public class PlainTextFunction_1421293551Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_512667282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(512667282L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2103250221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2103250221L))
            info.setReturnValue("DXpVex@_}/\u25DAzj\u9185!");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1978645641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1978645641L))
            info.setReturnValue(-2051647930);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1171484336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1171484336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries_1718207150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1718207150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/nbt/CompoundTag;Lcom/mojang/brigadier/CommandDispatcher;)Lnet/minecraft/commands/functions/InstantiatedFunction;", cancellable = true)
    private void instantiate_1411266244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1411266244L))
            info.setReturnValue(null);
    }


}
