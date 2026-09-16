package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.item.TeamColor.class)
public class TeamColor_1661081528Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_265830873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(265830873L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_752455259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(752455259L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1863462244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1863462244L))
            info.setReturnValue("C<\"^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2076533678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2076533678L))
            info.setReturnValue(566209690);
    }

    @Inject(at = @At("HEAD"), method = "calculate(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void calculate_440676243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(440676243L))
            info.setReturnValue(-445459232);
    }

    @Inject(at = @At("HEAD"), method = "defaultColor()I", cancellable = true)
    private void defaultColor__1084524229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1084524229L))
            info.setReturnValue(1998324990);
    }


}
