package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.numeric.UseDuration.class)
public class UseDuration1341110653Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)F", cancellable = true)
    private void get__147686587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-147686587L))
            info.setReturnValue(5.758569E8F);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__54140001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-54140001L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_432484385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(432484385L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2111534178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111534178L))
            info.setReturnValue("c|o6ox*}T8lDqoPiaGA1\u5202Zjn %\"i1+07|joQ+\u389F93KB;Q\u451Dq\uA04A-1nQF(H$zrcmIjgO@om6\uD28DyD?\uCE7Eme&]w*Kw^Y\u5EB6k9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1898462744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1898462744L))
            info.setReturnValue(941593641);
    }

    @Inject(at = @At("HEAD"), method = "remaining()Z", cancellable = true)
    private void remaining__1618253058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1618253058L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "useDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private static void useDuration_354616833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(354616833L))
            info.setReturnValue(-464307921);
    }


}
