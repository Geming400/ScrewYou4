package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.input.SingleOptionInput.class)
public class SingleOptionInput_2024745937Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1116119668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1116119668L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1499797835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1499797835L))
            info.setReturnValue("A*a\"/&olZ%D)6hQgYScIP'R0HL;O/a%m,\u0456<z[R-hA/Ys8PB:\uFD38Z\u789Am\u6391*$|&5SUW");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1712869269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1712869269L))
            info.setReturnValue(-338688291);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries__1973307760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1973307760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_384597936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(384597936L))
            info.setReturnValue(750012018);
    }

    @Inject(at = @At("HEAD"), method = "label()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void label__1657947561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1657947561L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "initial()Ljava/util/Optional;", cancellable = true)
    private void initial_1869703362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1869703362L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "labelVisible()Z", cancellable = true)
    private void labelVisible_316919145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(316919145L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mapCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void mapCodec_1280750866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1280750866L))
            info.setReturnValue(null);
    }


}
