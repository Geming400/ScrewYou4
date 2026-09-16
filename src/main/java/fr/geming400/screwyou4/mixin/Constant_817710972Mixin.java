package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.item.Constant.class)
public class Constant_817710972Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__577539683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-577539683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value__1486959984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1486959984L))
            info.setReturnValue(-1171125444);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__90915297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-90915297L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1588134496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1588134496L))
            info.setReturnValue("N_2\uB75F\uCE3C\u9011G^pY;u\u4937\u83182%\"tG>");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1375063062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1375063062L))
            info.setReturnValue(-1302354947);
    }

    @Inject(at = @At("HEAD"), method = "calculate(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void calculate__402694313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-402694313L))
            info.setReturnValue(1120098815);
    }


}
