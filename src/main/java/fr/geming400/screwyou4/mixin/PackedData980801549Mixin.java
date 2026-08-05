package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.PalettedContainerRO.PackedData.class)
public class PackedData980801549Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1928653488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1928653488L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__154658426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-154658426L))
            info.setReturnValue(" ߢ႟Vw㙝ye6Zy3/&aP`6䴒SF/Uiw1嗗3T{b UFⳉ飆uשׂP0!:gM筩6!H}`⠻F/kkRI(ﮂxV<Xp RM${4R{ivByꔋZ6q!f");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1019064291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1019064291L))
            info.setReturnValue(-250140291);
    }

    @Inject(at = @At("HEAD"), method = "storage()Ljava/util/Optional;", cancellable = true)
    private void storage_1226262971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1226262971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paletteEntries()Ljava/util/List;", cancellable = true)
    private void paletteEntries__1687828931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1687828931L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bitsPerEntry()I", cancellable = true)
    private void bitsPerEntry_1019063795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1019063795L))
            info.setReturnValue(-46992871);
    }


}
