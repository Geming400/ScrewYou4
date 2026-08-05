package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.stats.ServerRecipeBook.Packed.class)
public class Packed_939706868Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1969748170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1969748170L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__195753108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-195753108L))
            info.setReturnValue("\uA80A\">hhB(TlH\u1B85Gb?#=\u35C4{'-?7x\uD523Qx");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_977969609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(977969609L))
            info.setReturnValue(-594223183);
    }

    @Inject(at = @At("HEAD"), method = "known()Ljava/util/List;", cancellable = true)
    private void known__1728923613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1728923613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "settings()Lnet/minecraft/stats/RecipeBookSettings;", cancellable = true)
    private void settings__127378973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-127378973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "highlight()Ljava/util/List;", cancellable = true)
    private void highlight__1728923613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1728923613L))
            info.setReturnValue(null);
    }


}
