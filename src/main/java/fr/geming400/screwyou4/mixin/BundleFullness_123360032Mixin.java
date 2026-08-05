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
            info.setReturnValue(4.188201E8F);
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
            info.setReturnValue("rX紞+ᵣb:뗨L-]u[&G`qUBqLV基=A?}YF}聴ZT$Z,jVoep⑅<tL%<gvkSJf^dyP⚈(섽矝 +oTꀉL>䍏/!#eYc7#Fzi墯shs}⨎峮");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_161622773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(161622773L))
            info.setReturnValue(736924801);
    }


}
