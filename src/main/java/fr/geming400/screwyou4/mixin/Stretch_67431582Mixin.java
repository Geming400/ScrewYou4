package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.gui.GuiSpriteScaling.Stretch.class)
public class Stretch_67431582Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/resources/metadata/gui/GuiSpriteScaling$Type;", cancellable = true)
    private void type__165333558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-165333558L))
            info.setReturnValue(net.minecraft.client.resources.metadata.gui.GuiSpriteScaling.Type.TILE);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__841194687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-841194687L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_837855106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(837855106L))
            info.setReturnValue(":-5siFwS[o\u2F2DN#\u3839cuL&h/WG\u6DF6HE\u58D6E:D<D|N\u5B4B\u9B3FH{nYW}zkW`k7_]#\u54ED9}-{LjT)%8!]N*P?\uA8ADI<[[H?r\u3D2A[\u9252QAt*t\u8CE1+NO:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_624783672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(624783672L))
            info.setReturnValue(1273741539);
    }


}
