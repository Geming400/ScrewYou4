package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.item.Firework.class)
public class Firework_212374937Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_1948228660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1948228660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1597887195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1597887195L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__923085039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-923085039L))
            info.setReturnValue(")w`cKᅚ[9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_250637678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(250637678L))
            info.setReturnValue(-1135076757);
    }

    @Inject(at = @At("HEAD"), method = "calculate(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void calculate__443938290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-443938290L))
            info.setReturnValue(-1615748845);
    }

    @Inject(at = @At("HEAD"), method = "defaultColor()I", cancellable = true)
    private void defaultColor_250637182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(250637182L))
            info.setReturnValue(-931929337);
    }


}
