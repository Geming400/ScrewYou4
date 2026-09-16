package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.stats.ServerRecipeBook.Packed.class)
public class Packed_939706868Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_31080599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(31080599L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1710130392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1710130392L))
            info.setReturnValue("=+tyD5yC.mN/W_{@:.\u43C31\uC98B?wEMsha'Z_ne@5\u449ATm)}Hc\uA48B>d)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1497058958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497058958L))
            info.setReturnValue(-1331600646);
    }

    @Inject(at = @At("HEAD"), method = "known()Ljava/util/List;", cancellable = true)
    private void known_1060305894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1060305894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "highlight()Ljava/util/List;", cancellable = true)
    private void highlight_1302782679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1302782679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "settings()Lnet/minecraft/stats/RecipeBookSettings;", cancellable = true)
    private void settings__977556090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-977556090L))
            info.setReturnValue(null);
    }


}
