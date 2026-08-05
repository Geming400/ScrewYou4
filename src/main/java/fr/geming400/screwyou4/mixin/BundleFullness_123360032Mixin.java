package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.numeric.BundleFullness.class)
public class BundleFullness_123360032Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)F", cancellable = true)
    private void get__887683055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-887683055L))
            info.setReturnValue(7.96442E7F);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_1859213755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1859213755L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1508872290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1508872290L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1012099944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1012099944L))
            info.setReturnValue("rX\u7D1E+\u1D63b:\uB5E8L-]u[&G`qUBqLV\u57FA=A?}YF}\u8074ZT$Z,jVoep\u2445<tL%<gvkSJf^dyP\u2688(\uC13D\u77DD +oT\uA009L>\u434F/!#eYc7#Fzi\u58AFshs}\u2A0E\u5CEE");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_161622773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(161622773L))
            info.setReturnValue(398750401);
    }


}
