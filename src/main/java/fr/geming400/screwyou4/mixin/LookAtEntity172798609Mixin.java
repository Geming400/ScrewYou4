package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.LookAt.LookAtEntity.class)
public class LookAtEntity172798609Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1558310868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558310868L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__962661366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-962661366L))
            info.setReturnValue("S#Ↄ-㌼;beR\"}^p5g?yos5AhcZc6TH-D2EA`Y讱|K<㤚5ycxt6am50O\"QB9AO-C7찪]HrF&ct艮pQ]?=jO>WI拜q");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_211061351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(211061351L))
            info.setReturnValue(-813093638);
    }

    @Inject(at = @At("HEAD"), method = "anchor()Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;", cancellable = true)
    private void anchor__1738016633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1738016633L))
            info.setReturnValue(net.minecraft.commands.arguments.EntityAnchorArgument.Anchor.FEET);
    }

    @Inject(at = @At("HEAD"), method = "entity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void entity_2001687063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2001687063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "perform(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void perform_1085558171(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1085558171L))
            info.cancel();
    }


}
