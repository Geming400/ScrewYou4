package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.operations.Move.class)
public class Move_2100631335Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__808823703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-808823703L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_965171359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965171359L))
            info.setReturnValue("dXk`&i`w#6u$2JJ!SOzoO籸횖튰&\"Y}뢧䱚2轗r*pI%nZtDZ^k(j9R!IE㥛-wDn");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2138894076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2138894076L))
            info.setReturnValue(1053133761);
    }

    @Inject(at = @At("HEAD"), method = "from()Ljava/lang/String;", cancellable = true)
    private void from_965170863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965170863L))
            info.setReturnValue("9|z俆ix}᫄o:O1yYﭏr鑦93㰤6Ჷh6m魚cqz-FVF確elAY`Qa20YⒹb[4$╂g|]$^<bj6@+\");
    }

    @Inject(at = @At("HEAD"), method = "to()Ljava/lang/String;", cancellable = true)
    private void to_965170863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965170863L))
            info.setReturnValue("9|z俆ix}᫄o:O1yYﭏr鑦93㰤6Ჷh6m魚cqz-FVF確elAY`Qa20YⒹb[4$╂g|]$^<bj6@+\");
    }

    @Inject(at = @At("HEAD"), method = "fix(Ljava/nio/file/Path;Lnet/minecraft/util/worldupdate/UpgradeProgress;)V", cancellable = true)
    private void fix_314446155(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(314446155L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "relative(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/util/filefix/operations/Move;", cancellable = true)
    private void relative_705232219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(705232219L))
            info.setReturnValue(null);
    }


}
