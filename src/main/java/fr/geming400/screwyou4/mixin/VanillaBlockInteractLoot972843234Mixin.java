package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaBlockInteractLoot.class)
public class VanillaBlockInteractLoot972843234Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_64216966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(64216966L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1743266759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1743266759L))
            info.setReturnValue("\u856E\u7651,St.\u39DA\u4D96#1CqGj\u97B3![\u273A(PMq]O\uA2C6P\u8700\u01F3R1u}ayfLK+6?d0dK\u2761'+H%\uA256!Yf\u172582]\u78839V\uB838NGX^K}`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1530195325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1530195325L))
            info.setReturnValue(328066641);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate_710382573(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(710382573L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries__1592881896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1592881896L))
            info.setReturnValue(null);
    }


}
