package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.TextDisplay.Align.class)
public class Align1351934430Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/Display$TextDisplay$Align;", cancellable = true)
    private static void values_1049606308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1049606308L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/Display$TextDisplay$Align;", cancellable = true)
    private static void valueOf_1954920289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1954920289L))
            info.setReturnValue(net.minecraft.world.entity.Display.TextDisplay.Align.RIGHT);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_216473959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(216473959L))
            info.setReturnValue("t4&/ꯉ=+ld=\"+㿪O");
    }


}
