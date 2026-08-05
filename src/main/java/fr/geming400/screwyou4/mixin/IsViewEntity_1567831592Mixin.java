package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.IsViewEntity.class)
public class IsViewEntity_1567831592Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get_1698954167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1698954167L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_172580937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(172580937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_659205323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(659205323L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1956712180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1956712180L))
            info.setReturnValue("\u65C9\uD725\u0D5A\u6223Jd>Zt%(d&\uFD04\u766Bg/\u0D01C5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2125183682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125183682L))
            info.setReturnValue(-1328042733);
    }


}
