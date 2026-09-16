package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.FishingRodCast.class)
public class FishingRodCast_923340062Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get_1054462637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054462637L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__471910593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-471910593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_14713793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(14713793L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1693763586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693763586L))
            info.setReturnValue("\u838E!TR5TU\u7E42\u5A9BY u[be([3=. %f-5#<\u617FPE6IU)W\u6735\uD437wVc\uA7A6\u65EA7dF@oWs.\u7B05K\u7F9A8VDVX?X \u9DE7>/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1480692152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1480692152L))
            info.setReturnValue(285143597);
    }


}
