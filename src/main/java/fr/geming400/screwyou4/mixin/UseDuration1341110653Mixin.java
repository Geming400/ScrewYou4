package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.numeric.UseDuration.class)
public class UseDuration1341110653Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)F", cancellable = true)
    private void get_330067567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(330067567L))
            info.setReturnValue(4.280587E8F);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1218002919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1218002919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1568344384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1568344384L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_205650678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(205650678L))
            info.setReturnValue("l=燿㯎^l皱@5ᶇk2b6m$|ecii%#JD㾏;$VX`Rq뫶]-8쏁$Hw'3皍葂ꄏ8 3(NTn녶NN");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1379373395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1379373395L))
            info.setReturnValue(-1738702841);
    }

    @Inject(at = @At("HEAD"), method = "remaining()Z", cancellable = true)
    private void remaining_1379389236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1379389236L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "useDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private static void useDuration_443930246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(443930246L))
            info.setReturnValue(1423303196);
    }


}
