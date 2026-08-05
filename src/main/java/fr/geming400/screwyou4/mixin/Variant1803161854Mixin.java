package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.cow.MushroomCow.Variant.class)
public class Variant1803161854Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/cow/MushroomCow$Variant;", cancellable = true)
    private static void values_1083024235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1083024235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/cow/MushroomCow$Variant;", cancellable = true)
    private static void valueOf__1641564284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1641564284L))
            info.setReturnValue(net.minecraft.world.entity.animal.cow.MushroomCow.Variant.RED);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1891370476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1891370476L))
            info.setReturnValue("9C\"\u5B52!Z|]DG\uA12FS?E\"aGOY/#Y*edo\u2C99tXskkB\u2112$K#-\uFEE4>?A\u1BF3vFf\u07F8?Pv}fc[s|MM:IRAf7E\uD195\u233Fbv!uR$jr'xOGL\u44B0*/m");
    }

    @Inject(at = @At("HEAD"), method = "getBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_118368614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(118368614L))
            info.setReturnValue(null);
    }


}
