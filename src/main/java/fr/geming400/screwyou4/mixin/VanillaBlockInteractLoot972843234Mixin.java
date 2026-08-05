package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaBlockInteractLoot.class)
public class VanillaBlockInteractLoot972843234Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1936611803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1936611803L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__162616741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-162616741L))
            info.setReturnValue("Q\u5311;HkoV,R#\u3BC3LKi-6$ggo]\uFAA86%a\u077B.\u4365@MH>\u9EB5 PfusZ!^C}gcjRZbY");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1011105976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1011105976L))
            info.setReturnValue(-478144474);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate__765307656(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-765307656L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries_659635901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(659635901L))
            info.setReturnValue(null);
    }


}
