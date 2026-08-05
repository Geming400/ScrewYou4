package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.numeric.Cooldown.class)
public class Cooldown_165296189Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)F", cancellable = true)
    private void get__845746898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-845746898L))
            info.setReturnValue(5.99181E7F);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_1901149912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1901149912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1550808447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1550808447L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__970163787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-970163787L))
            info.setReturnValue("B&V8(!IWg;}\uB69F#%Q9*J11u\u38E2k7(coRv=mE?dQf5OY\uA1F3\u263BB.gG2X<}I)FAj :udOc0z<937kKD>pD*pnG_o");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_203558930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(203558930L))
            info.setReturnValue(-495232579);
    }


}
