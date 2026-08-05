package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.UseEffects.class)
public class UseEffects465884889Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1851397148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1851397148L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__669575086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-669575086L))
            info.setReturnValue("%(mꎼX6D70;'J#/x휨|<ꅗZI'<40ESWlN@.>穘VM3wn0/7$?G,l?Bky<n읬_g3㣁3M`'-쮖_Qg㮛L㮔Y'TT'*nImOE$*Z7J");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_504147631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504147631L))
            info.setReturnValue(129897957);
    }

    @Inject(at = @At("HEAD"), method = "speedMultiplier()F", cancellable = true)
    private void speedMultiplier_504144252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504144252L))
            info.setReturnValue(5.4291E8F);
    }

    @Inject(at = @At("HEAD"), method = "canSprint()Z", cancellable = true)
    private void canSprint_504163472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504163472L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "interactVibrations()Z", cancellable = true)
    private void interactVibrations_504163472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504163472L))
            info.setReturnValue(false);
    }


}
